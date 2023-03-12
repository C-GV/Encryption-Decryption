package encryptdecrypt

import java.io.File

const val ENCRYPTION = "enc"
const val DECRYPTION = "dec"
const val DEFAULT_MODE = ENCRYPTION
const val KEY = 0
const val DATA = ""
const val STREAM_DATA = ""
const val ALGORITHM = "shift"
const val STREAM_OUT = ""
const val ALGORITHM_UNICODE = "unicode"

fun encryption(string: String, key: Int, output: String, alg: String) {
    var encryptedWord = ""
    if (alg == ALGORITHM_UNICODE) {
        for (char in string.indices) {
            encryptedWord += (string[char] + key).toString()
        }
    } else {
        for (char in string.indices) {
            if (string[char].isLowerCase()) {
                if ((string[char] + key).code > 122) {
                    encryptedWord += (((string[char] + key) - 122) + 96).toString()
                } else {
                    encryptedWord += (string[char] + key).toString()
                }
            } else if ((string[char] + key).code > 90) {
                encryptedWord += (((string[char] + key) - 90) + 64).toString()
            } else if (string[char].code < 65) {
                encryptedWord += (string[char]).toString()
            } else{
                encryptedWord += (string[char]+key).toString()
            }
        }
    }

    if (!output.isEmpty()) {
        write(encryptedWord, output)
    } else {
        print("Error")
    }
    return
}

fun decryption(string: String, key: Int, output: String, alg: String) {
    var decryptedWord = ""
    if (alg == ALGORITHM_UNICODE) {
        for (char in string.indices) {
            decryptedWord += (string[char] - key).toString()
        }
    } else {
        for (char in string.indices) {
            if (string[char].isLowerCase()) {
                if ((string[char] - key).code < 97) {
                    decryptedWord += (((string[char] - key) + 26)).toString()
                } else {
                    decryptedWord += (string[char] - key).toString()
                }
            } else if ((string[char] + key).code < 65) {
                decryptedWord += ((string[char] - key) + 26).toString()
            } else {
                decryptedWord += (string[char] - key).toString()
            }
        }
    }

    if (!output.isEmpty()) {
        write(decryptedWord, output)
    } else {
        print("Error")
    }
    return
}

fun read(string: String): String {
    val workingDirectory = System.getProperty("user.dir")
    val separator = File.separator
    val fileName = "${workingDirectory}${separator}${string}"


    val file = File(fileName)
    var lines = ""
    if (file.exists()) {
        lines = file.readText()
    }
    return lines
}

fun write(string: String, dataOutputStream: String) {
    val workingDirectory = System.getProperty("user.dir")
    val separator = File.separator
    val fileName = "${workingDirectory}${separator}${dataOutputStream}"
    print(read(dataOutputStream))
    File(fileName).writeText(string)

}

fun commandParser(array: Array<String>) {
    var mode = DEFAULT_MODE
    var key = KEY
    var data = DATA
    var dataStream = STREAM_DATA
    var dataOutputStream = STREAM_OUT
    var alg = ALGORITHM

    for (i in array.indices) {
        if (i != array.size - 1) {
            when (array[i]) {
                "-mode" -> mode = array[i + 1]
                "-key" -> key = array[i + 1].toInt()
                "-data" -> data = array[i + 1]
                "-in" -> dataStream = read(array[i + 1])
                "-out" -> dataOutputStream = array[i + 1]
                "-alg" -> alg = array[i + 1]
            }
        }
    }

    if (data.isEmpty()) {
        data = dataStream
    }
    when (mode) {
        ENCRYPTION -> encryption(data, key, dataOutputStream, alg)
        DECRYPTION -> decryption(data, key, dataOutputStream, alg)
        else -> print("Unknown Operation")
    }


}

fun main(args: Array<String>) {
    commandParser(args)

}