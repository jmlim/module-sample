
### spring boot + gradle을 이용한 멀티모듈 프로젝트 예제 샘플
 - 출처 : https://www.hanumoka.net/2019/10/04/springBoot-20191004-springboot-gradle-multimodule/
 - 매번 까먹어서 샘플코드로 남김
 
### 추가로 nexus 3.x 설치 후 사용.

docker 로 nexus 3.x 설치.
~~~
$ mkdir /Users/jmlim/nexus-data
$ docker run -d -p 8081:8081 --name nexus -v /Users/jmlim/nexus-data:/nexus-data sonatype/nexus3
~~~

1. http://localhost:8081 로 접속 후 admin 패스워드 확인 (nexus-data folder의 패스워드 위치 파일 알려줌).
2. 패스워드 확인 후 변경.

nexus 업로드 및 가져오는 코드는 소스 참고하기 (nexus 관련 이라고 주석으로 표기)

 - 출처
    - https://github.com/sonatype/docker-nexus3
    - https://blog.kingbbode.com/posts/nexus-3xx-maven-npm