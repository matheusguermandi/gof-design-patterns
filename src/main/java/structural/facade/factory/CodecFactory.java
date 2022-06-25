package structural.facade.factory;

import structural.facade.VideoFile;
import structural.facade.compression.Codec;
import structural.facade.compression.MPEG4CompressionCodec;
import structural.facade.compression.OggCompressionCodec;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
