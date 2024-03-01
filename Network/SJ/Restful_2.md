# 20240301

> 참고 : https://restfulapi.net/resource-naming/

## Restful API Naming 규칙 

Restful API란 Rest의 설계 규칙을 준수한 API를 말한다.

- 클라이언트는 인터넷에서 특정한 리소스를 식별하는데 사용되는 문자열의 일반적인 형식인 URI(Uniform Resource Identifier)를 통해 서버에 요청한다.
- Rest에서 일차적인 데이터 표현(representation)을 리소스(resource)라고 한다. 
- 만약 회원이 자신의 닉네임을 요청했을 경우, 여기서 리소스는 '회원'이다. 만약 '게시글을 작성하다'라는 동작이 있을 때 여기서 리소스는 '게시글'이다.

아래는 URI에 대한 규칙이다. 

### 1. 명사를 사용하라.

만약 회원탈퇴 API URI를 설계할 경우, 아래와 같이 동사를 사용하는 것은 좋지 않은 방식이다.

`GET` /users/delete (X)

URI는 동작이 아닌 리소스를 가리키는 것이다.
리소스에 대한 작업은 HTTP METHOD로 이미 명시가 되어있기 때문에 별도로 URI에 동작이 나타날 필요는 전혀 없다.
아래는 간단한 예시이다. 예시와 같이 하나의 URI로 자원에 대한 수정, 삭제, 생성을 모두 관리할 수 있다.

`DELETE` /user-management/users <- 회원 탈퇴

`POST` /user-management/users <- 회원 가입

`PATCH` /user-management/users <- 회원 정보 수정

#### 1-1. 문서(document)

문서 리소스는 개체 인스턴스 또는 DB 레코드와 유사한 단일 개념이다.  
일반적으로 문서의 상태 표현에는 값이 포함된 필드와 다른 관련 리소스에 대한 링크가 모두 포함된다.
단수로 표현된다. 

`POST` /**user-management**/users

#### 1-2. 컬렉션(collection)

- 서버가 관리하는 리소스 디렉토리이다.
- 새로운 리소스를 만들 것인지 여부는 컬렉션 리소스에 달려 있다.
- 보통 새 자원을 추가할 경우엔 POST 방식을 사용한다.
- 복수를 사용한다. 

`POST` /user-management/**users**

#### 1-3. 스토어(Store)

- 클라이언트가 관리하는 자원 저장소이다. 
- 클라이언트가 리소스의 URI를 알고 관리할 수 있다. 
- 복수를 사용한다.

`PUT` /user-management/**users**/(id)/**playlists**


### 2. 일관성있게 설계하라

#### 2-1. 계층적 관계를 나타내기 위해 슬래시(/)를 사용합니다
''/'는 리소스 간의 계층적 관계를 나타내는 데 사용된다.

#### 2-2. 맨 마지막에 /를 사용하지 말라.

`PUT` /user-management/**users**/(id)/playlists/ (X)
`PUT` /user-management/**users**/(id)/playlists (O)

전자말고, 후자를 사용하는 것이 좋다. 

#### 2-3. _(언더스코어) 대신 -(하이픈)을 사용하라.

응용 프로그램의 글꼴에 따라 `_`은 일부 혹은 완전히 가려질 수 있다는 위험이 있다.

`PUT` /user_management/users/(id)/playlists (X)
`PUT` /user-management/users/(id)/playlists (O)

#### 2-4. 소문자를 사용하라.
일관적으로 소문자를 사용하는 것이 좋다. 

`PUT` /user_management/users/(id)/Playlists (X)
`PUT` /user-management/users/(id)/playlists (O)


