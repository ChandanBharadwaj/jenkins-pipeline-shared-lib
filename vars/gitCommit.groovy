#!/usr/bin/env groovy

def call(String message = 'Initial Commit') {
  echo "Message, ${message}."
  sh git --version
  sh git branch -l
}
