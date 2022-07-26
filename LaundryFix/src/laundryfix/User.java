//parent class
package laundryfix;

public interface User {
    public void setNama(String nama);//mutuator method
    public void setAlamat(String alamat);
    public void setTelepon(String telepon);

    public String getNama(int id);//acsesor method
    public String getAlamat(int id);
    public String getTelepon(int id);
}
