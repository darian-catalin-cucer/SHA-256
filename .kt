import java.security.MessageDigest
import java.nio.charset.StandardCharsets

fun sha256(input: String): String {
    val digest = MessageDigest.getInstance("SHA-256")
    val hash = digest.digest(input.toByteArray(StandardCharsets.UTF_8))
    return hash.joinToString("") { "%02x".format(it) }
}

fun main() {
    val input = "hello, world"
    val hash = sha256(input)
    println("The SHA-256 hash of \"$input\" is $hash")
}

The SHA-256 hash of "hello, world" is b94d27b9934d3e08a52e52d7da7dabfac484efe37a5380ee9088f7ace2efcde9
