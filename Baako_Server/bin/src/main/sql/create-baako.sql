CREATE DATABASE BAAKO;

GRANT ALTER, SELECT,INSERT,UPDATE,DELETE,CREATE,DROP, INDEX
           ON BAAKO.*
           TO spq@'%'
           IDENTIFIED BY 'spq';

GRANT ALTER, SELECT,INSERT,UPDATE,DELETE,CREATE,DROP, INDEX
           ON BAAKO.*
           TO spq@localhost
           IDENTIFIED BY 'spq';