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
        stage('Run Shell Command') {
            steps {
                script {
                    // Shell komutunu çalıştırın ve çıktıları 'output' adlı değişkene atayın
                    def output = sh(script: 'ls -al', returnStdout: true).trim()
                    def errorOutput = sh(script: 'ls -al', returnStatus: true).stderr.trim()

                    // 'output' ve 'errorOutput' değişkenlerini yazdırın
                    echo "Çıktı: ${output}"
                    echo "Hata Çıktısı: ${errorOutput}"
                }
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
