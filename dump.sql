--
-- PostgreSQL database dump
--

-- Dumped from database version 12.6 (Ubuntu 12.6-0ubuntu0.20.04.1)
-- Dumped by pg_dump version 12.6 (Ubuntu 12.6-0ubuntu0.20.04.1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Data for Name: carro; Type: TABLE DATA; Schema: public; Owner: ti2cc
--

COPY public.carro (ano, cor, modelo, marca) FROM stdin;
2021	branco	palio	fiat
2020	azul	gol	vw
1999	prata	palio	fiat
2001	preto	palio	fiat
\.


--
-- PostgreSQL database dump complete
--

