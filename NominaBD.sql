PGDMP                         w            ProyectoNominaBD    11.4    11.4                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false                       1262    16418    ProyectoNominaBD    DATABASE     �   CREATE DATABASE "ProyectoNominaBD" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Spain.1252' LC_CTYPE = 'Spanish_Spain.1252';
 "   DROP DATABASE "ProyectoNominaBD";
             postgres    false            �            1259    16443    Contrato    TABLE     �   CREATE TABLE public."Contrato" (
    "idContrato" integer NOT NULL,
    "tipoContrato" character(15),
    "TrabajadorFK" integer,
    "RecordDeAsistenciaFK" integer,
    "SueldoGradoFK" integer
);
    DROP TABLE public."Contrato";
       public         postgres    false            �            1259    16463    Pagos    TABLE     �   CREATE TABLE public."Pagos" (
    "Aumento" double precision,
    "Descuento" double precision,
    "Fecha" date,
    "idPago" integer NOT NULL,
    "Monto" double precision,
    "ContratoFK" integer
);
    DROP TABLE public."Pagos";
       public         postgres    false            �            1259    16424    RecordDeAsistencia    TABLE     �   CREATE TABLE public."RecordDeAsistencia" (
    "idRecordDeAsistencia" integer NOT NULL,
    "diasExtra" integer,
    "Faltas" integer,
    "horasExtra" integer,
    "Tardanzas" integer
);
 (   DROP TABLE public."RecordDeAsistencia";
       public         postgres    false            �            1259    16429    SueldoGrado    TABLE     g   CREATE TABLE public."SueldoGrado" (
    "idSueldoGrado" integer NOT NULL,
    "Grado" character(10)
);
 !   DROP TABLE public."SueldoGrado";
       public         postgres    false            �            1259    16419 
   Trabajador    TABLE     ~   CREATE TABLE public."Trabajador" (
    "idTrabajador" integer NOT NULL,
    "DNI" character(8),
    "Nombre" character(20)
);
     DROP TABLE public."Trabajador";
       public         postgres    false                      0    16443    Contrato 
   TABLE DATA               {   COPY public."Contrato" ("idContrato", "tipoContrato", "TrabajadorFK", "RecordDeAsistenciaFK", "SueldoGradoFK") FROM stdin;
    public       postgres    false    199   �                 0    16463    Pagos 
   TABLE DATA               c   COPY public."Pagos" ("Aumento", "Descuento", "Fecha", "idPago", "Monto", "ContratoFK") FROM stdin;
    public       postgres    false    200   �                 0    16424    RecordDeAsistencia 
   TABLE DATA               x   COPY public."RecordDeAsistencia" ("idRecordDeAsistencia", "diasExtra", "Faltas", "horasExtra", "Tardanzas") FROM stdin;
    public       postgres    false    197                    0    16429    SueldoGrado 
   TABLE DATA               A   COPY public."SueldoGrado" ("idSueldoGrado", "Grado") FROM stdin;
    public       postgres    false    198   I                 0    16419 
   Trabajador 
   TABLE DATA               G   COPY public."Trabajador" ("idTrabajador", "DNI", "Nombre") FROM stdin;
    public       postgres    false    196   ~       �
           2606    16447    Contrato idContratoPK 
   CONSTRAINT     a   ALTER TABLE ONLY public."Contrato"
    ADD CONSTRAINT "idContratoPK" PRIMARY KEY ("idContrato");
 C   ALTER TABLE ONLY public."Contrato" DROP CONSTRAINT "idContratoPK";
       public         postgres    false    199            �
           2606    16467    Pagos idPagoPK 
   CONSTRAINT     V   ALTER TABLE ONLY public."Pagos"
    ADD CONSTRAINT "idPagoPK" PRIMARY KEY ("idPago");
 <   ALTER TABLE ONLY public."Pagos" DROP CONSTRAINT "idPagoPK";
       public         postgres    false    200            �
           2606    16435 )   RecordDeAsistencia idRecordDeAsistenciaPK 
   CONSTRAINT        ALTER TABLE ONLY public."RecordDeAsistencia"
    ADD CONSTRAINT "idRecordDeAsistenciaPK" PRIMARY KEY ("idRecordDeAsistencia");
 W   ALTER TABLE ONLY public."RecordDeAsistencia" DROP CONSTRAINT "idRecordDeAsistenciaPK";
       public         postgres    false    197            �
           2606    16433    SueldoGrado idSueldoGradoPK 
   CONSTRAINT     j   ALTER TABLE ONLY public."SueldoGrado"
    ADD CONSTRAINT "idSueldoGradoPK" PRIMARY KEY ("idSueldoGrado");
 I   ALTER TABLE ONLY public."SueldoGrado" DROP CONSTRAINT "idSueldoGradoPK";
       public         postgres    false    198            �
           2606    16437    Trabajador idTrabajadorPK 
   CONSTRAINT     g   ALTER TABLE ONLY public."Trabajador"
    ADD CONSTRAINT "idTrabajadorPK" PRIMARY KEY ("idTrabajador");
 G   ALTER TABLE ONLY public."Trabajador" DROP CONSTRAINT "idTrabajadorPK";
       public         postgres    false    196            �
           2606    16468    Pagos ContratoFK    FK CONSTRAINT     �   ALTER TABLE ONLY public."Pagos"
    ADD CONSTRAINT "ContratoFK" FOREIGN KEY ("ContratoFK") REFERENCES public."Contrato"("idContrato");
 >   ALTER TABLE ONLY public."Pagos" DROP CONSTRAINT "ContratoFK";
       public       postgres    false    2706    199    200            �
           2606    16453    Contrato RecordDeAsistenciaFK    FK CONSTRAINT     �   ALTER TABLE ONLY public."Contrato"
    ADD CONSTRAINT "RecordDeAsistenciaFK" FOREIGN KEY ("RecordDeAsistenciaFK") REFERENCES public."RecordDeAsistencia"("idRecordDeAsistencia");
 K   ALTER TABLE ONLY public."Contrato" DROP CONSTRAINT "RecordDeAsistenciaFK";
       public       postgres    false    2702    199    197            �
           2606    16458    Contrato SueldoGradoFK    FK CONSTRAINT     �   ALTER TABLE ONLY public."Contrato"
    ADD CONSTRAINT "SueldoGradoFK" FOREIGN KEY ("SueldoGradoFK") REFERENCES public."SueldoGrado"("idSueldoGrado");
 D   ALTER TABLE ONLY public."Contrato" DROP CONSTRAINT "SueldoGradoFK";
       public       postgres    false    198    199    2704            �
           2606    16448    Contrato TrabajadorFK    FK CONSTRAINT     �   ALTER TABLE ONLY public."Contrato"
    ADD CONSTRAINT "TrabajadorFK" FOREIGN KEY ("TrabajadorFK") REFERENCES public."Trabajador"("idTrabajador");
 C   ALTER TABLE ONLY public."Contrato" DROP CONSTRAINT "TrabajadorFK";
       public       postgres    false    196    199    2700                  x�3�L+��)��MU� NC����� mr�            x������ � �            x�3�4�4�4�4���@l����� '+�         %   x�3�LJL����I-R�2��ML�,.��b���� ���         .  x�U�Aj�0D��)t�"����L	L��E7[8����En�3�b��N���fF�������1��g�����K�Ns��x���xɴ	�r�Ư�hpBL+�č�@���9'q}���i��-�H�;񊱽m�a�vUe�!N)��/�[�P����{?�3]�ح�����0%q���/� (5	.�M�8�P�Y��Z��Q��"T�I��§�(������6��ְlH�S����CɬԦ�F�+F?��J��$eR��ԲN7���)�M �H���C�AK����H���9�͂w�     