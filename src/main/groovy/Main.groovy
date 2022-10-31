import com.pucenty.helloworld.MyHelloWorldClass
import com.pucenty.assertions.Tables

static void main(String[] args) {
  println "Hello world!"
//Printing string from class
  def str1 = "Hello moto!"
  MyHelloWorldClass.printHelloWorld(str1)
//Printing table contents from Tables class
  def table1 = [1,2,3,4,5,6,7]
  Tables.printtable(table1)
//Add element "8" to the table1
  (table1 << 8)
  Tables.printtable(table1)

  assert (table1 <<9) == [1,2,3,4,5,6,7,8,9]
}