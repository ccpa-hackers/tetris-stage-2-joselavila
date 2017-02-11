#!/bin/bash

STATUS=$(javac BlockStore.java 2>&1)

if [ -z "$STATUS" ]
then
  javac -cp .:junit-4.12.jar BlockStoreTest.java
  java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore BlockStoreTest
else
  echo "$STATUS"
fi
