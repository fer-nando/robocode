#!/bin/bash

./mvn.sh clean install ant:ant -DskipTests=true $*
#./mvn.sh eclipse:eclipse
