select * from breno.tb_usuario;
select * from breno.tb_grupo;
select * from breno.tb_usuario_x_grupo;
select * from breno.tb_permissao;
select * from tb_permissao_x_grupo;

--cadastra usaurio login: adm e senha: 123
insert into  breno.tb_usuario values(1,1,'adm','administrador','$2a$10$jfVgNZokWmd0mTVMfW/Qo.6tRiTYcOiZ.OR1G.bp.2N3XKY6CM7Em');

--cadastra grupos:
insert into  breno.tb_grupo values(1,'ADMIN','ADMIN');
insert into  breno.tb_grupo values(2,'CONSULTA','CONSULTA');

--cadastra usaurio em um grupo
insert into  breno.tb_usuario_x_grupo values(1,1);

---cadastra permissoes
insert into  breno.tb_permissao values(1,'ROLE_CADASTROUSUARIO','ROLE_CADASTROUSUARIO');
insert into  breno.tb_permissao values(2,'ROLE_CONSULTAUSUARIO','ROLE_CONSULTAUSUARIO');

--adiciona permissão aos grupos

--adciona ao grupo: ADMIN, persmissãoes de cadastro e consulta
insert into  breno.tb_permissao_x_grupo values(1,1);
insert into  breno.tb_permissao_x_grupo values(1,2);

--adiciona ao grupo: CONSULTA, permissão apenas de consulta
insert into  breno.tb_permissao_x_grupo values(2,2);

commit;