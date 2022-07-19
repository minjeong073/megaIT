SELECT * FROM `user`;

SELECT * FROM `user` WHERE `hobby` LIKE '%독서%';

-- 1종속화
INSERT INTO `user`
(`name`, `yyyymmdd`, `hobby`, `introduce`, `createdAt`, `updatedAt`, `email`)
VALUES
('김민정', '19980730', '독서', '안녕하세요 저는 누구일까요?', now(), now(), 'a@gmail.com'),
('김민정', '19980730', '노래', '안녕하세요 저는 누구일까요?', now(), now(), 'a@gmail.com'),
('김민정', '19980730', '영화', '안녕하세요 저는 누구일까요?', now(), now(), 'a@gmail.com');

SELECT * FROM `user` WHERE `hobby` = '독서';

-- new_user, hobby table