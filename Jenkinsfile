pipeline {
   agent any
   
    stages {
        stage('Checkout') {
            steps {
                // Kod deposundan projeyi çekmek için kullanılan adımlar
                checkout scm
            }
        }
       
        stage('Build') {
            steps {
                // Maven kullanarak projeyi derleme adımları
                sh './mvnw wrapper:wrapper'
            }
        }
        
        stage('Test') {
            steps {
                // Test adımları
                sh './mvnw wrapper:wrapper'
            }
        }
        stage('Deploy') {
            steps {
                // Uygulamayı dağıtma adımları
                sh './mvnw spring-boot:run'
            }
        }
        
    }
    post {
        failure {
           mail to: 'mertcantahanli@gmail.com',
             subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
             body: "Something is wrong with ${env.BUILD_URL}\n\nJob Name: ${env.JOB_NAME}"
        }
    }

}
