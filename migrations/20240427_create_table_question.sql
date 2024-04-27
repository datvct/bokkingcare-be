-- Table: public.question

-- DROP TABLE IF EXISTS public.question;

CREATE TABLE IF NOT EXISTS public.question
(
    question_id bigint NOT NULL DEFAULT nextval('question_question_id_seq'::regclass),
    question_title text COLLATE pg_catalog."default",
    options text[] COLLATE pg_catalog."default",
    answers bigint[],
    CONSTRAINT question_pkey PRIMARY KEY (question_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.question
    OWNER to postgres;