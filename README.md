여러가지 서적들을 참고하면서 기본적인 MVC패턴과 CRUD 생성방법, ORM 사용법들을 배웠다. 이제는 내가 직접 구현해볼 차례라고 생각한다.
이번 프로젝트로 최대한 도움을 받지 않은 상태로 그동안 공부한 내용을 바탕으로 게시판을 구현해보려고 한다.

초기 구상도는

회원가입을 실시하여 사용자를 인증하고 인증된 사용자만 게시글을 작성할 수 있으며, 인증되지 않은 사용자는 읽기만 가능하고 삽입, 수정 및 삭제는 불가능 하게 만드려고 한다.
회원가입은 Oauth2를 사용할 것이며, 네이버, 구글 인증을 도입하여 작성자 이름을 받아올것이다.
메인 페이지에는 회원가입, 게시글, 검색(작성자, 작성내용으로), 게시글 간략하게 보여주는 기능을 넣을것이며,
게시글을 클릭하면 게시글 번호, 작성자, 내용, 작성일시, 조회수 등을 보여주는 기능을 추가할 것이다.

사용하는 것은
JAVA, SpringBoot 2.6.13, gradle, Maria DB, H2 DB, Spring Data JPA, thymeleaf 등을 사용하여 구성할 계획이다.

추가적으로 기본 개념에 대한 정리도 게시판 글을 이용하여 실제활용 해볼 계획이다
