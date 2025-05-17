//pipeline + groovy
//import package
import com.i27academy.builds.Calculator

def call(Map pipelineparams){

    Calculator calculator = new Calculator(this)

pipeline{
    agent any
    environment{
        APP_NAME = {pipelineparams.appName}
    }
    stages{
        stage('AdditionStage'){
            steps{
                echo " adding two varible"
                println calculator.add(2,3)
                echo " Microservice name :${APP_NAME} "
            }
          }
          stage('secondStage'){
            steps{
                echo "second stage"
            }
          }
       }
    }

}

