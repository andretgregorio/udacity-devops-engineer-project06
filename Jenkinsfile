pipeline {
  agent {
    docker {
      image 'openjdk:11-jdk'
    }

  }
  stages {
    stage('Build') {
      agent {
        docker {
          image 'openjdk:11-jdk'
        }

      }
      steps {
        echo 'Building Kotlin application...'
        sh './gradlew assemble'
      }
    }

  }
}