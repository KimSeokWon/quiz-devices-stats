# 인터넷뱅킹 이용현황 정보

데이터셋 : http://data.seoul.go.kr/dataList/datasetView.do?infId=10909&srvType=S&serviceKind=2&c
## 개발 프레임워크

## 문제 해결 전략

### API 기능 명세
#### 기본 문제
- 데이터 파일(서울시 인터넷뱅킹 이용률 및 이용기기 통계 데이터)에서 각 레코드를 데이터베이스에
   저장하는 코드를 구현하세요.

- 인터넷뱅킹 서비스 접속 기기 목록을 출력하는 API 를 개발하세요.
```
{
    "devices" : [
        { “device_id”: “DIS7864654”,
            “device_name”: “스마트폰”},
        { “device_id”: “DIS231434”,
            “device_name”: “데스크탑 컴퓨터”},
         ...
        { "device_id”: “DIS645389”,
            “device_name”: “스마트패드”}
    ]
}
```
- 각 년도별로 인터넷뱅킹을 가장 많이 이용하는 접속기기를 출력하는 API 를 개발하세요.
```
{
    “devices” : [
        {   “year”: 2011,
            “device_id”: “DIS231434”,
            “device_name”: “데스크탑 컴퓨터”,
            “rate”: 95.1 },
        {   “year”: 2012,
            “device_id”: “DIS231434”,
            “device_name”: “데스크탑 컴퓨터”
            “rate”: 93.9 },
        ...
        {   “year”: 2018,
            "device_id”: “DIS936595”,
            “device_name”: “스마트폰”,
            “rate”: 90.5 }
    ]
}
```
- 특정 년도를 입력받아 그 해에 인터넷뱅킹에 가장 많이 접속하는 기기 이름을 출력하세요.
```
{
    “result” :
    {   “year”: 2011,
        “device_name”: “데스크탑 컴퓨터”,
        “rate”: 95.1
    }
}
```
- 디바이스 아이디를 입력받아 인터넷뱅킹에 접속 비율이 가장 많은 해를 출력하세요.
```
{
    “result” :
    {   “device_name”: 스마트폰,
        “year”: 2017,
        “rate”: 90.6 }
}
```   
#### 옵션 문제
- 인터넷뱅킹 접속 기기 ID 를 입력받아 2019 년도 인터넷뱅킹 접속 비율을 예측하는 API 를 개발하세요.
   
## 빌드 및 실행 방법

