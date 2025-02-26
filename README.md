## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

### 1. 문자열 계산기
- 기능 요구사항
 - [X] 문자열 입력
 - [X] 문자열 split
 - [X] 문자열 parseInt
 - [X] 사칙 연산 진행
    - [X] 문자열 입력 값에 따른 계산 순서 (기존 * / 우선 순위 무시)

- [X] 예외 처리
 - [X] 문자 split 제대로 안됨 -> 테코 두 번째랑 합산 확인 가능
 - [X] 문자 parseInt 제대로 안됨 (짝수번째 문자가 숫자가 아닌 경우 / 홀수번째 문자가 사칙연산 기호가 아닌 경우)
 - [X] 기대했던 숫자가 아닌 경우? -> 이건 논리 오류 예외까진 아님



### 2. 숫자 야구 게임
- 기능 요구 사항
 - [X] 숫자열 입력
 - [X] 숫자열 분리 및 파싱
 - [X] 컴퓨터 수 랜덤 생성
 - [X] 스트라이크 / 볼 / 낫싱 판별

- [X] 예외 처리
   - [X] 숫자가 아닌 입력 예외
   - [X] 3자리 숫자가 아닌 숫자 입력 예외
   - [ ] ?
