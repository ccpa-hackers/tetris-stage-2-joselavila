#!/bin/bash

STATUS=$(javac -cp .:junit-4.12.jar JUnitIntroTest.java)

if [ -z "$STATUS" ]
then
  java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore JUnitIntroTest
else
  echo "$STATUS"
fi
