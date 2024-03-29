# mvc-pratice

## Ch02. 개발 환경 구성하기
### 00. 웹 프로젝트 환경 구성
project Setting -> Modules -> mvc-pratice -> main -> Paths -> Output path 값 수정  
>mvc-pratice\out\production\java\main  
--->
mvc-pratice\webapps\WEB-INF\classes\java\main

project Setting -> Modules -> mvc-pratice -> test -> Paths -> Output path 값 수정
>mvc-pratice\out\test\classes  
--->
mvc-pratice\webapps\WEB-INF\classes\java\test

<br/>

### 01. 도커 및 도커 컴포즈 소개
#### 도커
- 컨테이너 기반의 가상화 플랫폼

#### 도커 허브
- 도커에서 제공하는 이미지 저장소  
>https://hub.docker.com/

#### 도커 컴포즈
- 다중 컨테이너를 정의하고 실행하기 위한 도구
- YAML 파일을 사용하여 다중 컨테이너를 구성함
>https://docs.docker.com/compose/

<br/>

### 02. 도커를 이용한 환경 구성하기

- 도커 설치  
https://www.docker.com/products/docker-desktop/  
설치 완료 후 아래 명령어를 통해 설치 확인(cmd 창에서 확인)
> docker -v  

<br/>

- MySQL 도커 이미지 다운로드  
1. https://hub.docker.com/
2. mysql 검색
3. docker pull mysql 텍스트 복사 후
> docker pull mysql:latest  
> 
> docker pull mysql:{version}

<br/>

- MySQL 도커 컨테이너 생성 및 실행  
> docker run --name mysql-serverwizard-container -e MYSQL_ROOT_PASSWORD=test -d -p 3307:3306 mysql:latest  
> 
> docker run --name mysql-sample-container -e MYSQL_ROOT_PASSWORD=<password> -d -p 3306:3306 mysql:{version}

<br/>

- 현재 실행중인 도커 컨테이너 목록 출력  
> docker ps  
> 
> docker ps -a

|CONTAINER ID|IMAGE|COMMAND|CREATED|STATUS|PORTS|NAMES|
|---|---|---|---|---|---|---|
|82732bd5fc21|mysql:latest|"docker-entrypoint.s…"|5 seconds ago|Up 4 seconds|33060/tcp, 0.0.0.0:3307->3306/tcp|mysql-serverwizard-container|

<br/>

- MySQL 도커 컨테이너 접속  
> docker exec -it mysql-serverwizard-container bash
> 
> docker exec -it {도커 컨테이너 이름} bash

<br/>

- MySQL 접속  
> mysql -u root -p

<br/>

## Ch03. 객체지향 패러다임
### 01. 테스트코드 실습

테스트 코드를 작성하는 이유?
1. 문서화 역할
2. 코드에 결함을 발견하기 위함
3. 리팩토링 시 안정성 확보
4. 테스트 하기 쉬운 코드를 작성하다 보면 더 낮은 결합도를 가진 설계를 얻을 수 있음

<br/>

### 02. 객체지향 개념 다지기
객체지향 프로그래밍 특징 4가지
1. 추상화 (Abstraction)
2. 다형성 (Polymorphism)
3. 캡슐화 (Encapsulation)
4. 상속 (Inheritance)

객체지향 설계 원칙 5가지 (SOLID)
1. SRP : Single Responsibility Principle (단일 책임의 원칙)
2. OCP : Open/Closed Principle (개방 폐쇄의 원칙)
3. LSP : Liskov’s Substitution Principle (리스코프 치환의 원칙)
4. ISP : Interface Segregation Principle (인터페이스 분리의 원칙)
5. DIP : Dependency Inversion Principle (의존성 역전의 원칙)

<br/>

### 03. 객체지향 프로그램밍 실습 - 사칙 연산 계산기
v -> v.operator.equals(operator) 확인 필요

### 04. 객체지향 프로그램밍 실습 - 학점 계산기

### 05. 객체지향 프로그래밍 실습 - 음식점에서 음식 주문하는 과정
Cook 에서 alt + insert -> equals() and hashCode() -> next...


  