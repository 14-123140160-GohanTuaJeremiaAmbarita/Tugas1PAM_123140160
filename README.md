# Tugas Praktikum 1 - Pengembangan Aplikasi Mobile

Proyek ini merupakan implementasi tugas pertama untuk mata kuliah **Pengembangan Aplikasi Mobile** di **Institut Teknologi Sumatera (ITERA)**. Aplikasi ini dibangun menggunakan teknologi **Kotlin Multiplatform (KMP)** dan **Compose Multiplatform** untuk dijalankan di berbagai platform (Android, iOS, dan Desktop).

## 👤 Informasi Mahasiswa
* **Nama:** GOHAN AMBARITA
* **NIM:** 123140160
* **Program Studi:** Teknik Informatika 

## 📝 Deskripsi Tugas
Sesuai dengan instruksi tugas praktikum minggu 1, proyek ini telah dimodifikasi untuk memenuhi poin-poin berikut: 
1.  **Modifikasi Teks:** Mengubah teks sambutan menjadi "Halo, GOHAN AMBARITA!".
2.  **Menampilkan NIM:** Menambahkan NIM "123140160" di bawah nama mahasiswa. 
3.  **Informasi Platform:** Menampilkan nama platform yang sedang digunakan secara dinamis (Android, iOS, atau Desktop) menggunakan pola *expect/actual*. 

## 📸 Screenshot Aplikasi
|  |
| :--- | 
|  | 

## 🛠️ Arsitektur & Teknologi
* **Bahasa:** Kotlin 
* **Framework Utama:** Kotlin Multiplatform (KMP) 
* **UI Toolkit:** Compose Multiplatform 
* **Pola Pengembangan:** MVVM (Model-View-ViewModel) 
* **Build System:** Gradle Kotlin DSL 

## 💻 Cara Menjalankan Proyek
Pastikan Anda telah melakukan *setup environment* sesuai materi perkuliahan (JDK 17, Android Studio, dan KMP Plugin). 

### Android
```bash
./gradlew :composeApp:installDebug
