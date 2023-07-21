pipeline {
   agent {
        docker {
            image 'my-jenkins-with-maven:latest'
            args '-v /path/to/your/maven/project:/app'
        }
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
}
