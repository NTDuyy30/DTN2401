use dtn2401;

create table trainee (
	trainee_id INT auto_increment primary KEY,
    full_name varchar(255),
    birth_date date,
    gender enum('male', 'female', 'unknow'),
    et_iq int check (et_iq >= 0 and et_iq <= 20),
    et_gmath int check (et_gmath >= 0 and et_gmath <= 20),
    et_english int check (et_english >= 0 and et_english <= 50),
    training_class varchar (10),
    evaluation_notes text
);

alter table trainee
add column vti_account varchar(255) not null unique;