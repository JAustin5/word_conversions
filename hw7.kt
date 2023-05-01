import kotlin.math.*
fun main(args: Array<String>) {
    val list = ArrayList<String>()

    args.map { list.add(it) }

    val numWords = list.map { it }.size

    var totalMean = 0
    list.map{
        val wordLen = it.length
        totalMean += wordLen
    }
    val devSec = 1 / numWords.toDouble()
    val mean = devSec.toDouble() * totalMean.toDouble()
    println("The mean is: $mean")

    var totalStddev = 0.0
    list.map{
        val squaring = (it.length.toDouble() - mean.toDouble()) * (it.length.toDouble() - mean.toDouble())
        totalStddev = totalStddev + squaring.toDouble()
    }
    val stddev = sqrt(devSec * totalStddev).toDouble()
    println("The standard deviation is: $stddev")
}