-- Jalankan SQL ini di SQL Editor Supabase
create table if not exists public.vip_tokens (
  id uuid primary key default gen_random_uuid(),
  token_key text unique not null,
  owner_name text,
  is_active boolean not null default true,
  device_id text,
  expires_at timestamptz,
  created_at timestamptz not null default now()
);

alter table public.vip_tokens enable row level security;

create policy "Allow read active tokens"
  on public.vip_tokens
  for select
  to anon
  using (true);

create policy "Allow bind device_id"
  on public.vip_tokens
  for update
  to anon
  using (is_active = true)
  with check (is_active = true);

-- Contoh token awal untuk pengujian
insert into public.vip_tokens (token_key, owner_name, is_active, expires_at)
values
  ('DEFF-VIP-2026-001', 'Admin Tester', true, now() + interval '365 days'),
  ('DEFF-VIP-DEMO-999', 'Demo User', true, now() + interval '30 days')
on conflict (token_key) do nothing;
