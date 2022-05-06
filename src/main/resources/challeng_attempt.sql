
--DROP TABLE IF EXISTS challenge_attempt;
--IF NOT EXISTS

CREATE TABLE IF NOT EXISTS challenge_attempt
(
  id int not null primary key AUTO_INCREMENT,
  alias varchar(255) not null,
  factorA int not null,
  factorB int not null,
  result_attempt int not null,
  correct boolean not null,
  when_Attempted datetime

);