package deffender.vip

data class DnsHostOption(
    val id: String,
    val name: String,
    val dnsHost: String,
    val description: String,
    val latencyLabel: String,
    val badgeText: String
)

object AppConfig {
    // 1. KONFIGURASI SUPABASE
    const val SUPABASE_URL = "https://twwgjswubwsilzpwfpso.supabase.co"
    const val SUPABASE_ANON_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImN4ZGZlZWJuYmV3bXVtdWJucWF6Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3OTU1MzQ1NjksImV4cCI6MjExMTExMDU2OX0.TXtxgvJdBxAKiklg8CISboAdXWHs3WtWDORc3OFrpJE"
    const val SUPABASE_TABLE = "vip_tokens"

    // 2. KONFIGURASI LINK WEBSITE BUY KEY (Bisa diubah sesuai link toko / WhatsApp / web order Anda)
    const val BUY_KEY_URL = "https://wa.me/6285175215023"

    // 3. 3 PILIHAN PRIVATE DNS BERBASIS HOSTNAME (BUKAN ANGKA IP)
    val DNS_OPTIONS = listOf(
        DnsHostOption(
            id = "cloudflare_host",
            name = "Cloudflare Private DNS",
            dnsHost = "one.one.one.one",
            description = "Ultra Cepat & Encrypted DNS",
            latencyLabel = "14 ms",
            badgeText = "CF"
        ),
        DnsHostOption(
            id = "adguard_host",
            name = "AdGuard Private DNS",
            dnsHost = "dns.adguard-dns.com",
            description = "Blokir Iklan, Tracker & Malware",
            latencyLabel = "18 ms",
            badgeText = "AG"
        ),
        DnsHostOption(
            id = "quad9_host",
            name = "Quad9 Security DNS",
            dnsHost = "dns.quad9.net",
            description = "Proteksi Phishing & Ancaman Siber",
            latencyLabel = "21 ms",
            badgeText = "Q9"
        )
    )
}
