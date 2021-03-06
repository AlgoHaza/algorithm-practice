# 🎁 알고하자 Naming Convention
```
모두가 함께 참여하는 레포지인 만큼 "깔끔한 파일구조" 가 매우 중요해요!
모두 아래에 있는 규칙들에 잘 맞추어 알고리즘을 작성해주세요!
```

## 폴더 컨벤션
### /algohaza
스터디의 최상위 폴더입니다. 여러분의 알고리즘 공부 내용부터 문제 풀이까지 모든 내용이 해당 폴더 안에 저장됩니다.

### /algohaza/practice/{service-name}
여러분이 해결한 알고리즘 문제들을 작성하는 곳 입니다. 이를 `연습 폴더`라고 합니다.

- 문제 출제 사이트를 기준으로 하위폴더(service-name)가 분류됩니다. 이를 `서비스 폴더`라고 합니다. 

  ex) /algohaza/practice/baekjoon
- 각 서비스폴더는 하위 폴더 및 파일에 대한 독자적인 NamingConvention 을 가지고 있으며, 

  이는 서비스폴더 바로 아래에 존재하는 NamingConvention.md 를 통해 명시됩니다.

  단, 모든 서비스폴더의 최하위에는 개인풀이 폴더가 존재해야합니다

  ex) /algohaza/practice/programmers/NamingConvention.md
- 이때 service-name 은 문제 출제 사이트 혹은 서비스의 **공식명칭** 을 **snake case**로 기입해야합니다.
- 만약, 문제 출제 사이트가 존재하지 않을 경우, 혹은 공식 사이트가 아닌 
  사설 그룹 혹은 블로그에 기재된 알고리즘 문제일 경우, `/etc` 폴더 안에
  블로그의 경우 **블로그 운영자의 이름** 사설그룹일 경우 **그룹의 이름** 등으로 하위폴더를 생성합니다.

- 이러한 `/etc` 폴더와 그 하위폴더들을 `기타 서비스 폴더`라고 합니다.

### /algohaza/practice/{service-name}/../{user-name}/XX.yy
여러분이 해결한 문제를 기록하는 폴더입니다. 이를 `개인풀이 폴더`라고 합니다. 
- 개인 풀이 폴더에는 자신이 푼 코드가 필수적으로 들어있어야합니다. 이를 해설파일이라고 합니다.

  또한 해당 코드의 내용과 파일이름, 확장자는 **실제 문제 풀이때 제출한 코드**와 일치해야합니다

  단, java 의 package 키워드같이 어쩔 수 없이 비제출 코드에만 들어가야하는 코드는 예외로 합니다.
- 또한, 해설 파일 이외에도 diagram.png/jpg 이라는 이미지 파일, doc.md 파일로 풀이과정 혹은 해설을 첨부할 수 있습니다.

## 이슈 컨벤션
질문, 컨벤션 위반 제보, 건의 등 스터디 내에서 발생하는 일에 대한 문의는 Issue 를 통해 하실 수 있습니다.
### 알고리즘 문제 관련 질문
알고리즘 문제에 대한 질문은 gist 를 통해 다음과 같은 양식으로 작성합니다.
#### Gist 양식
제목 : [알고리즘 - {service-name}] {path} 문제 질문

ex) [알고리즘 - BaekJoon] _1000번대/_1002_터렛 TimeLimitError 원인 관련 질문
- service-name : 전술한 서비스 폴더의 이름 (Pascal Case로 표기)
- path : 서비스 폴더 내에서 질문 대상 문제의 위치
  
  ex) _1000번대/_1002_터렛
- 문제 질문은 `~~관련질문`, `~~질문` 등으로 끝날 수 있도록 합니다.
#### Issue 양식
```md
### 요약
문제 질문 <기존 제목의 문제 질문 을 적어주시면 됩니다/>
- **[문제링크]()**<문제 링크를 괄호 안에 작성해주세요./>
- **[자신이 푼 코드]()**<기존에 양식에 따라 작성한 Gist 링크를 괄호 안에 작성해주세요./>

### 질문 내용
<질문에 대한 세부 내용을 적어주세요/>
```

질문 이슈 게시시, `질문` 라벨을 추가하여 게시합니다.