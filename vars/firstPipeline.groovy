//pipeline + groovy
//import package
import com.i27academy.builds

Calculator cal = new Calculator(this)

pipeline{
    agent any
    stages{
        stage('AdditionStage')
        {
            steps{
                echo " adding two varible"
                println Calculator.add(2,3)
            }
        }
        stage('MultiplicationStage'){
                echo " MultiplicationStage two varible"
                println Calculator.multiply(2,3)
            }

    }
}