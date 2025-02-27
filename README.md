## 프로젝트 개요

- **프로젝트 명칭**: CineLog
- **프로젝트 소개**: 영화를 기록하고 의견을 교류할 수 있는 웹 사이트
- **개발 인원**: 1명
- **개발 기간**: 2025.2 ~
- **주요 기능**:
    1. **영화 기록 기능**: 사용자가 자신이 본 영화를 날짜별로 기록하고, 별점 및 코멘트를 추가할 수 있음.
    2. **영화 검색 및 데이터 연동**: TMDB API를 활용해 영화 정보를 검색하고 기록에 추가할 수 있음.
    3. **커뮤니티 기능**: 게시판을 통해 사용자들이 영화에 대한 의견을 작성하고 댓글로 교류 가능.
    4. **사용자 인증 및 관리**: Spring Security를 활용한 회원가입, 로그인, 로그아웃, 권한 관리 기능.
    5. **통계 기능**: 사용자가 기록한 영화의 총 개수, 평균 별점 등을 시각화하여 제공.
    6. **반응형 UI/UX**: 다양한 디바이스에서 사용 가능한 반응형 디자인 구현.
- **백엔드 개발 언어**: Java 21
- **백엔드 개발 환경**: IntelliJ, Spring Boot, Gradle, JPA, Spring Security
- **데이터베이스**: MySQL
- **형상관리**: GitHub
- **이슈관리**: GitHub

## 프로젝트 요구사항

1. **기본 요구사항**
    - 회원가입 및 로그인 기능 구현 (Spring Security 사용).
    - 영화 정보를 날짜별로 기록하는 CRUD 기능.
    - TMDB API 연동을 통한 영화 검색 기능.
2. **커뮤니티 요구사항**
    - 게시판 기능: 게시글 작성, 수정, 삭제.
    - 댓글 기능: 댓글 작성, 삭제, 수정.
    - 게시글 및 댓글의 페이징 처리.
3. **UI/UX 요구사항**
    - 달력 기반의 영화 기록 뷰 제공.
    - 사용자 친화적인 게시판 인터페이스.
    - 모바일 및 데스크톱에 대응하는 반응형 디자인.
4. **추가 요구사항**
    - 사용자별 영화 기록 통계 제공 (총 영화 수, 평균 별점 등).
    - GitHub를 통한 협업 및 버전 관리.
    - GitHub Issues로 개발 단계별 작업 관리.
5. **배포 요구사항**
    - 로컬 개발 환경과 동일한 설정으로 클라우드 환경에 배포.
    - 배포 후 기본 테스트 시나리오 수행 (기록, 검색, 커뮤니티 기능 확인).
