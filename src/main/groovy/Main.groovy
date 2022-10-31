import com.pucenty.helloworld.MyHelloWorldClass
import com.pucenty.assertions.Tables

static void main(String[] args) {
  println "Hello world!"
  MyHelloWorldClass.printHelloWorld()
//Printing table contents from Tables class
  def table1 = [1,2,3,4,5,6,7]
  Tables.printtable(table1)
}