DESC `user`;

SELECT * FROM `user`;

INSERT INTO `user`
(`name`, `yyyymmdd`, `hobby`, `introduce`, `createdAt`, `updateAt`, `email`)
VALUE
('김민정', '19980730', '독서,노래,영화', '안녕하세요 저는 누구일까요>', now(), now(), 'a@gmail.com');

INSERT INTO `user`
(`name`, `yyyymmdd`, `hobby`, `introduce`, `createdAt`, `updateAt`, `email`)
VALUES
('김꾸꾸', '20030517', '멍때리기', '멍~~~~~', now(), now(), 'kk@gmail.com'),
('김바다', '20191115', '사냥하기', '나랑 놀아줄 집사', now(), now(), 'bada@gmail.com'),
('김바다', '20200319', '컴퓨터', '할말이 업서', now(), now(), 'gg@gmail.com');
