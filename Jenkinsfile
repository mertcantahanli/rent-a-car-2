pipeline {
    agent {
        label 'your_jenkins_agent' // Jenkins ajanının etiketini veya adını buraya yazın
        // Ajanın JDK 17 veya yüksek bir sürümü olduğundan emin olun
        tools { jdk 'JDK_17' } // JDK sürümünü burada belirtin
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
