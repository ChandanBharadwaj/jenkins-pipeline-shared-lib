#!/usr/bin/env groovy

def call(String message = 'Initial Commit') {
  echo "Message, ${message}."
  git --version
  git branch -l
}
