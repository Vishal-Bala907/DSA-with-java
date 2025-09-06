For the byte oriented streams, a buffered stream extends a filtered stream class by attaching a memory
buffer to the I/O stream. This allows java to do I/O operations on more than a byte at a time, thereby 
improving the performance.
Because the buffer is available. skipping,marking and resetting of the stream become possible 