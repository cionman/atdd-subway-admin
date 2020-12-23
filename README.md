<p align="center">
    <img width="200px;" src="https://raw.githubusercontent.com/woowacourse/atdd-subway-admin-frontend/master/images/main_logo.png"/>
</p>
<p align="center">
  <img alt="npm" src="https://img.shields.io/badge/npm-%3E%3D%205.5.0-blue">
  <img alt="node" src="https://img.shields.io/badge/node-%3E%3D%209.3.0-blue">
  <a href="https://edu.nextstep.camp/c/R89PYi5H" alt="nextstep atdd">
    <img alt="Website" src="https://img.shields.io/website?url=https%3A%2F%2Fedu.nextstep.camp%2Fc%2FR89PYi5H">
  </a>
  <img alt="GitHub" src="https://img.shields.io/github/license/next-step/atdd-subway-admin">
</p>

<br>

# 지하철 노선도 미션
[ATDD 강의](https://edu.nextstep.camp/c/R89PYi5H) 실습을 위한 지하철 노선도 애플리케이션

<br>

## 🚀 Getting Started

### Install
#### npm 설치
```
cd frontend
npm install
```
> `frontend` 디렉토리에서 수행해야 합니다.

### Usage
#### webpack server 구동
```
npm run dev
```
#### application 구동
```
./gradlew bootRun
```
<br>

## ✏️ Code Review Process
[텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

<br>

## 🐞 Bug Report

버그를 발견한다면, [Issues](https://github.com/next-step/atdd-subway-admin/issues) 에 등록해주세요 :)

<br>

## 📝 License

This project is [MIT](https://github.com/next-step/atdd-subway-admin/blob/master/LICENSE.md) licensed.

## Step 1 

1. 지하철 노선 생성 인수테스트 구현하기
2. 지하철 노선 생성 단위테스트 구현 및 기능 구현하기
3. 지하철 노선 조회 인수테스트 구현하기
4. 지하철 노선 조회 단위테스트 구현 및 기능 구현하기
5. 지하철 노선 수정 인수테스트 구현하기
6. 지하철 노선 수정 단위테스트 구현 및 기능 구현하기
7. 지하철 노선 삭제 인수테스트 구현하기
8. 지하철 노선 삭제 단위테스트 구현 및 기능 구현하기
9. 코드 리팩토링 

## Step 2

1. 노선 생성 시 종점역 추가하기
    - LineRequest 전달 받을 필드 추가
    - LineRequest 필드 추가에 따른 Line 인수 테스트 수정
    - LineRequest 필드 추가에 따른 Line 단위 테스트 수정
    - Station정보를 가져오는 서비스 메서드 작성
    - Section 구간 정보 추가 
    - Line과 연관 관계 설정 및 필드 추가

2. 노선 조회 응답 결과에 등록된 구간을 참고하여 역 목록 응답 추가
    - LineResponse 역목록을 포함하도록 수정
    - 역목록 응답을 검증하는 인수 테스트 수정
    - 역목록 응답을 검증하는 단위 테스트 수정
    - LineResponse에 역목록을 포함하도록 기능 추가

## Step3

1. Step2 피드백 대응
2. Line에 List<Section> 필드를 일급컬렉션으로 치환
3. 지하철 구간 등록 인수 테스트 작성
    - 상행역을 기준으로 역사이 새로운 역 추가
    - 하행역을 기준으로 역사이 새로운 역 추가
    - 상행 종점 교체
    - 하행 종점 교체
4. 지하철 구간 등록 기능 구현
5. 구간 등록 예외 케이스 인수 테스트 작성
    - 역 사이에 새로운 역을 등록할 경우 기존 역 사이 길이보다 크거나 같으면 등록을 할 수 없음
    - 상행역과 하행역이 이미 노선에 모두 등록되어 있다면 추가할 수 없음
    - 상행역과 하행역 둘 중 하나도 포함되어있지 않으면 추가할 수 없음
6. 구간 등록 예외 케이스 처리 기능 구현
7. 실제 서버 구동 후 확인 작업 및 코드 정리