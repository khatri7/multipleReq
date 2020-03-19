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
            stage('Four')
            {
                parallel
                {
                    stage('Unit Test')
                    {
                        steps{
                            echo "runnig the unit test"
                        }
                    }
                    stage('Integration Test')
                    {
                        steps{
                            echo "Running the integration test"
                        }
                    }
                }
            }
        }
}
