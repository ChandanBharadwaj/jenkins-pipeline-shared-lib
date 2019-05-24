withCredentials([usernamePassword(credentialsId: 'CB_GITHUB', passwordVariable: 'GIT_PASSWORD', usernameVariable: 'GIT_USERNAME')]) {
    sh("git tag -a some_tag -m 'Jenkins'")
    sh('git push https://${GIT_USERNAME}:${GIT_PASSWORD}@github.com/ChandanBharadwaj/jenkins-pipeline-shared-lib.git --tags')
}
