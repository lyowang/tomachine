-- Table: public.historical_data

-- DROP TABLE public.historical_data;

CREATE TABLE public.historical_data
(
  date date NOT NULL,
  "time" time without time zone NOT NULL,
  open double precision,
  high double precision,
  low double precision,
  close double precision,
  vol integer,
  pair_id bigint NOT NULL,
  CONSTRAINT historical_data_pk PRIMARY KEY (pair_id, date, "time"),
  CONSTRAINT historical_data_fk FOREIGN KEY (pair_id)
      REFERENCES public.pair (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.historical_data
  OWNER TO postgres;

-- Index: public.fki_historical_data_fk

-- DROP INDEX public.fki_historical_data_fk;

CREATE INDEX fki_historical_data_fk
  ON public.historical_data
  USING btree
  (pair_id);

-- Index: public.historical_data_idx

-- DROP INDEX public.historical_data_idx;

CREATE INDEX historical_data_idx
  ON public.historical_data
  USING btree
  (date, "time");


-- Table: public.pair

-- DROP TABLE public.pair;

CREATE TABLE public.pair
(
  id bigint NOT NULL,
  name character varying(10),
  CONSTRAINT pair_pk PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.pair
  OWNER TO postgres;
