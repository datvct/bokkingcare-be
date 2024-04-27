-- Table: public.submit_answer
-- DROP TABLE IF EXISTS public.submit_answer;
CREATE TABLE IF NOT EXISTS public.submit_answer
(
   id bigint NOT NULL DEFAULT nextval ('submit_answer_id_seq'::regclass),
   answer bigint[],
   CONSTRAINT submit_answer_pkey PRIMARY KEY (id)
)
TABLESPACE pg_default;
ALTER TABLE IF EXISTS public.submit_answer OWNER to postgres;