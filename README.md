# The Email Formatter

<p align="center">
  <img src="./images/logo.png" height="200" width="300" />
</p>

<div align="center">
    <img src="./images/sbt-logo.png" height="50" width="120" />
    <img src="./images/scala-logo.png" height="50" width="120" />
</div>

## Overview

<strong>The Email Formatter.</strong>

Receives a text and formats it according to the characters limit per line.

The project is based on Simple Build Tool and developed using Scala programming language.

## How to run
### Please prefer to run this project in a Docker container:
#### 1. Clone this repo from github
    git clone https://github.com/gustavogmail/backend-challenge.git
#### 2. In the project root folder:
    docker build -t backend-challenge:v1 .
    docker run backend-challenge:v1

### Running locally
#### Make sure you have: 
<ul>
    <li><a href="https://docs.scala-lang.org/getting-started/index.html">Scala</a> installed</li>
    <li><a href="https://www.oracle.com/java/technologies/downloads/#jdk18-windows">JDK</a> installed</li>
    <li><a href="https://www.scala-sbt.org/download.html">sbt</a> installed</li>
</ul>

#### 1. Clone this repo from github
    git clone https://github.com/gustavogmail/backend-challenge.git
#### 2. Add sbt\bin directory to your System Environment path variable

#### 3. (In the project's root folder) run all the unit test scenarios:
    sbt test
