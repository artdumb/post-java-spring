# 소모임 진흥방한

## 1. Welcome Page

HomeApiController에서 GetMapping(”/”)으로 메인화면html 매핑

## 2. 글올리기, 글목록조회하기 API
GET : url/api/posts  —> 글목록조회

POST : url/api/posts —> 글업로드!

스프링데이터 JPA를 활용하여 리포지토리 인터페이스

findAll, save 메소드 활용하여 기능구현

![Untitled](https://user-images.githubusercontent.com/98328569/160963278-b19f089a-010f-4601-8a08-45ff79744cb2.png)



