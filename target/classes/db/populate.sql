insert into platform_user (id, email, password, user_type, username)
values
 ('99544c6e-57cf-46f8-b181-222537a8f528','smecheras1@yahoo.com','sm123','STUDENT','smecheras1'),
 ('99544c6e-57cf-46f8-b181-222537a8f529','smecheras2@yahoo.com','sm123','STUDENT','smecheras2'),
 ('99544c6e-57cf-46f8-b181-222537a8f52a','google_franchise@google.com','123','COMPANY','google'),
 ('99544c6e-57cf-46f8-b181-222537a8f52b','apple_franchise@google.com','123','COMPANY','apple');

insert into student (first_name, last_name, id) values
('smecheras','no1','99544c6e-57cf-46f8-b181-222537a8f528'),
('smecheras','no2', '99544c6e-57cf-46f8-b181-222537a8f529');

insert into company (description, location, name, id) values
('google desc', 'LA Nevada', 'Google','99544c6e-57cf-46f8-b181-222537a8f52a' ),
('apple desc', 'Denver Carolina', 'Apple','99544c6e-57cf-46f8-b181-222537a8f52b');

insert into internship(id, domain, end_date, salary, start_date, company_id,name) values
 ('d8744bdc-0891-4b15-aeee-7033b4d45e31', 'IT', '2020-03-03', 1200, '2020-05-03', '99544c6e-57cf-46f8-b181-222537a8f52a', 'Android Internship' ),
 ('d8744bdc-0891-4b15-aeee-7033b4d45e32', 'IT', '2020-03-01', 1000, '2020-05-01', '99544c6e-57cf-46f8-b181-222537a8f52a', 'Java Internship' ),
 ('d8744bdc-0891-4b15-aeee-7033b4d45e33', 'IT', '2020-03-03', 1200, '2020-06-03', '99544c6e-57cf-46f8-b181-222537a8f52b', 'Apple Internship' );
