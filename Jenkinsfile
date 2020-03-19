<<<<<<< HEAD
pipeline
{
    agent any
        stages
        {
            stage('One')
            {
                steps
                {
                    echo 'Hi, this is the first stage'
                }
            }
            stage('Two')
            {
                steps
                {
                    input('Do you want to peroceed?')
                }
            }
            stage('Three')
            {
                when
                {
                    not
                    {
                        branch "master"
                    }
                    steps
                    {
                        echo "Hello"
                    }
                }
            }
        }
}
=======
node{
  stage('SCM Checkout'){
    git 'https://github.com/khatri7/multipleReq.git'
   }
   stage('Compile-Package'){
    sh 'mvn package'
   }
 }
>>>>>>> ef427f0661bc3338b6dc7c8391de6dd1b1521d6a
