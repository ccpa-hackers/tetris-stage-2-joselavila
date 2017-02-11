#!/bin/bash

STATUS=$(javac Hopper.java 2>&1)

if [ -z "$STATUS" ]
then
  javac -cp .:junit-4.12.jar HopperTest.java
  java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore HopperTest
else
  echo "$STATUS"
fi
