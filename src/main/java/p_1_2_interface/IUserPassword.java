package p_1_2_interface;

public interface IUserPassword {
    /**
     * kullanıcı şifre değiştirme fonksiyonu
     * @param uid
     * @param oldPassword
     * @param newPassword
     * @return boolean
     */
    boolean userPasswordChange( int uid, String oldPassword, String newPassword );

}
