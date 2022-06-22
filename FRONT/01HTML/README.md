# HTML

### input tag

+ text
  + 기본 입력 태그
  + placeholder : 배경으로 설명 추가
  + value : 미리 특정 값 입력

+ password
  + 입력값 보이지 않음 * 로 대체

+ radio
  + name을 같게 할 경우 하나만 선택 가능
  + checked : html 열리면 자동으로 기본 체크 되도록
  + < label> < input> < label> : 버튼 이외에도 항목 이름을 선택할 경우 체크 되도록

+ checkbox
  + 여러 항목 중복 선택 가능

+ file
  + 파일 선택 입력

+ select
  + 화살표 누르면 선택 목록 펼쳐짐
  + < option> 안에 목록 추가
  + selected : 자동으로 선택되도록

+ textarea
  + rows, cols 로 크기 조정
  + < pre> 처럼 태그 사이의 모든 것이 화면에 나타남

+ button
  + type="button" 추가하는게 좋음
  + < input type="button" value="제출"> 로도 가능

<hr>

### table

+ tr
  + 줄(행)
  + 안에 < td> 칸(열) 들어가야함

+ thead
  + 표 머리
  + < th> : 굵은 글씨

+ tbody
  +  표 몸통

+ span
  + 병합하고자 하는 첫번째 칸에 속성 추가
  + colspan : 가로 병합
  + rowspan : 세로 병합
  + 병합할 경우 해당 col 또는 row 삭제해야함
