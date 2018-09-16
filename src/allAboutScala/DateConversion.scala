package allAboutScala

import java.text.SimpleDateFormat
object DateConversion extends App{
  
  
val inputFormat = new SimpleDateFormat("MM-DD-YYYY")
val outputFormat = new SimpleDateFormat("YYYY/MM/DD")

val date = "03-29-2017"
val formattedDate = outputFormat.format(inputFormat.parse(date))

println(formattedDate)
}