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